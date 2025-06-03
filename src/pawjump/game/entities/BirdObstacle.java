package pawjump.game.entities;

import pawjump.game.animation.SpriteAnimator;
import pawjump.game.utils.Constants;
import javax.swing.ImageIcon;

public class BirdObstacle extends Obstacle {
    public BirdObstacle(double x, double y) {
        super(x, y, Constants.OBSTACLE_WIDTH, Constants.OBSTACLE_HEIGHT, null); // No single image path
        // Bird specific animation
        this.animator = new SpriteAnimator(Constants.OBSTACLE_BIRD_SHEET, 6,
                                           (new ImageIcon(Constants.OBSTACLE_BIRD_SHEET).getImage().getWidth(null) / 6),
                                           new ImageIcon(Constants.OBSTACLE_BIRD_SHEET).getImage().getHeight(null),
                                           Constants.BIRD_ANIM_DELAY, true);
        this.animator.play();
    }
    
    @Override
    public void updateSpecific() {
        if (this.animator != null) {
            this.animator.update();
        }
        // Floating obstacles don't move vertically on their own in the original code,
        // their Y is set at spawn time.
    }
    // Drawing is handled by Obstacle.draw with a check for BirdObstacle instance for scaling
}
