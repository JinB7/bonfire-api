package io.github.jinb7.gamecuration.domain.game.mapper;

import io.github.jinb7.gamecuration.domain.game.dto.GameSummaryResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GameMapper {
    List<GameSummaryResponse> findAllGames();

    List<GameSummaryResponse> findGamesByKeyword(@Param("keyword") String keyword);
}
