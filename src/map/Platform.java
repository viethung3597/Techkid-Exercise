package map;

import Util.SpriteUtil;
import base.GameObject;
import physic.BoxCollider;
import physic.PhysicBody;
import renderer.ImageRenderer;

public class Platform extends GameObject implements PhysicBody {
    private BoxCollider boxCollider;

    public Platform() {
        this.boxCollider = new BoxCollider(32, 32);
//        this.children.add(boxCollider);
    }

    @Override
    public BoxCollider getBoxCollider() {
        return boxCollider;
    }

    @Override
    public boolean isActive() {
        return false;
    }


    public static Platform create(int platformType) {
        System.out.println(platformType);
        Platform platform = new Platform();
        switch (platformType) {
//            case 3:
//                platform.renderer = new ImageRenderer(SpriteUtil.loadImage("assets/images/sprite/platform0000.png"));
//                break;
            case 34 :
                platform.renderer = new ImageRenderer(SpriteUtil.loadImage("resources/images/stone.png"));
                break;
            case 1:
                platform.renderer = new ImageRenderer(SpriteUtil.loadImage("resources/images/wall.png"));
                break;
        }
        return platform;
    }
}
