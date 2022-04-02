# XnauiMUD

XnauiMUD (Pernounced /ik.shnau.i/) is my attempt at makeing a basic MUD.

To install, download and run `build/Xnaui-Setup.jar`

### Features

A checked box means it is completed.

- [ ] Tutorial Rooms

### Features (Technical)

List of classes (And what they inheret from):
- [x] item
    - [x] item.Item
        - [x] item.Tool
            - [ ] item.Sword
                - [ ] item.WoodenSword
        - [ ] item.Wood
        - [ ] item.Stone
    - [ ] item.Container (Holds items)
        - [ ] Chest
- [ ] PlayerInventory
- [ ] Entity
    - [ ] Player
    - [ ] NPC
    - [ ] Enimies
- [ ] Room
    - [ ] tutorial
        - [ ] Tutorial1 (Explain controlls)
        - [ ] Tutorial2 (Pick up items and inventory)
        - [ ] Tutorial3 (Turn Bassed combat)
        - [ ] Tutorial4 (Building)
        - [ ] Tutorial5 (Map)
    - [ ] worldCeter (Package)
        - [ ] worldCenter.WorldCenter (The senter of the entire MUD)
        - [ ] worldCenter.Hallway1
        - [ ] worldCenter.Hallway2
        - [ ] worldCenter.Vault
    - [ ] Town
        - [ ] triePeaks (Package)
            - [ ] triePeaks.TownSquare
            - [ ] triePeaks.House1
    - [ ] rooms (A package of generic rooms)
        - [ ] rooms.Ocean
        - [ ] rooms.River
        - [ ] rooms.DeepRiver
        - [ ] rooms.Shore
