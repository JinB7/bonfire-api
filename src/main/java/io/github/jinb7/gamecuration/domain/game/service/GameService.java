package io.github.jinb7.gamecuration.domain.game.service;

import io.github.jinb7.gamecuration.domain.game.dto.GameSummaryResponse;
import io.github.jinb7.gamecuration.domain.game.mapper.GameMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameMapper gameMapper;

    public List<GameSummaryResponse> getGames() {
        return gameMapper.findAllGames();
    }


    public List<GameSummaryResponse> getAutocompleteGames(String keyword) {
        if (keyword == null || keyword.isBlank()) {
            return List.of();
        }
        return gameMapper.findGamesByKeyword(keyword.trim());
    }

}
