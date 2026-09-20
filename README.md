![Pinpoint banner](https://cdn.modrinth.com/data/cached_images/3d2ebfcc9c41b4e94b5df24f65af8aaf5b76fbac_0.webp)

Pinpoint is a lightweight, client-side Minecraft utility designed to make copying your player coordinates quick and effortless.

Press the K key (by default) at any time in-game to retrieve your current player position and copy the coordinates directly to your system clipboard.

For example:
```
238 64 -517
```
Pinpoint then confirms the action with a simple in-game message:
```
Player coordinates copied.
```

[![Modrinth](https://img.shields.io/badge/Available_on-Modrinth-lime)](https://www.curseforge.com/minecraft/mc-mods/pinpoint-coordinates)
[![CurseForge](https://img.shields.io/badge/Available_on-CurseForge-orange)](https://modrinth.com/project/pinpoint-coordinates)
[![GitHub](https://img.shields.io/badge/Available_on-GitHub-darkgrey)](https://github.com/fmsjd/pinpoint-coordinates)

## Features

- One-key coordinate copying — Press K to copy your current player coordinates.
- Simple clipboard format — Coordinates are copied as X Y Z, making them easy to paste anywhere.
- Accurate coordinate handling — Pinpoint retrieves the player's precise position before converting it into block coordinates.
- Vanilla-friendly — No unnecessary interfaces, systems, or gameplay changes.
- Client-side — Designed as a small client utility without requiring gameplay functionality on the server.
- Minimal and efficient — Pinpoint focuses on doing one useful thing without adding unnecessary overhead.

## Design Philosophy

Pinpoint is intentionally small.

The goal is not to add dozens of unrelated features, but to provide simple utilities that solve minor annoyances in Minecraft while remaining lightweight, unobtrusive, and easy to maintain.

Future versions may expand Pinpoint with additional small utilities while keeping the same philosophy: simple, useful, efficient, and vanilla-friendly.

## Controls

- Copy Player Coordinates - K

The key binding can be changed through Minecraft's Controls menu.

## Requirements (v1.0.0)

- Minecraft Java Edition 26.2
- Fabric Loader
- Fabric API

Pinpoint is a client-side mod.

[![Minecraft](https://img.shields.io/badge/Minecraft-26.2-green)](https://www.minecraft.net/)
[![Fabric](https://img.shields.io/badge/Loader-Fabric-blue)](https://fabricmc.net/)
[![Version](https://img.shields.io/badge/Version-1.0.0-orange)](https://github.com/fmsjd/pinpoint-coordinates/releases)

## Development

Pinpoint is open-source and developed using the Fabric modding toolchain.

The project aims to keep its codebase small, modular, and easy to understand, with each utility separated into focused components.

## License

This template ([Fabric Modding Template](https://github.com/FabricMC/fabric-example-mod)) is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.