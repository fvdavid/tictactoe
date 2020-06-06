package tic.tac.toe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import tic.tac.toe.service.GameService;

@Controller
@SessionAttributes("game")
public class GameController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index( @ModelAttribute("game" ) GameService game ) {
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String markTile( 
			@ModelAttribute("game" ) GameService game,
			@RequestParam("tile_id") String tileId,
			@RequestParam(value = "new_game", required = false, defaultValue = "false") boolean newGame,
			@RequestParam(value = "player_go_first", required = false, defaultValue = "false") boolean playerGoFirst 
			) {
		
		if ( newGame ) {
			game.reset();
			game.setPlayerGoFirst( playerGoFirst );
			if ( !playerGoFirst ) {
				// give computer a small advantage by always placing X in the center as its first move
				game.markTile( "1-1" );
			}
		} else {
			game.markTile( tileId ); // Player Turn
			
			game.markTileRandom(); // Computer Turn
		}
		
		return "index";
	}
	
	@ModelAttribute("game")
	public GameService populateGame() {
		return new GameService();
	}

}