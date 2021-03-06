package Tile;


import Game.Game;
import Game.Handler;
import Game.Id;

import java.awt.*;

public class Floor extends Tile {
    public Floor(int x, int y, int width, int height, boolean solid, Id id, Handler handler) {
        super(x,y,width,height,solid,id,handler);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Game.floor.getBufferImage(), x, y, width, height, null);

    }

    @Override
    public void tick() {

    }
}
