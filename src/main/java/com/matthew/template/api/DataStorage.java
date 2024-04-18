package com.matthew.template.api;

import com.matthew.template.modules.player.structure.PlayerData;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface DataStorage {

    @NotNull
    public CompletableFuture<Void> init();

    @NotNull
    public CompletableFuture<PlayerData> load(@NotNull PlayerData player);

    @NotNull
    public CompletableFuture<PlayerData> save(@NotNull PlayerData player);

    @NotNull
    public CompletableFuture<List<PlayerData>> save(@NotNull Collection<? extends PlayerData> players);

}