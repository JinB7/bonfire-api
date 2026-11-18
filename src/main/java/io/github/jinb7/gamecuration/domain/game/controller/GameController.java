package io.github.jinb7.gamecuration.domain.game.controller;

import io.github.jinb7.gamecuration.domain.game.dto.GameSummaryResponse;
import io.github.jinb7.gamecuration.domain.game.service.GameService;
import io.github.jinb7.gamecuration.global.common.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/games")
@RequiredArgsConstructor
public class GameController {
    private final GameService gameService;

    @GetMapping
    public ApiResponse<List<GameSummaryResponse>> getGames() {
        return ApiResponse.ok(gameService.getGames());
    }


    @GetMapping("/autocomplete")
    public ApiResponse<List<GameSummaryResponse>> getAutocompleteGames(
            @RequestParam(required = false) String keyword) {
        return ApiResponse.ok(gameService.getAutocompleteGames(keyword));
    }
}
