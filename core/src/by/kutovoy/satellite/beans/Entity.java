package by.kutovoy.satellite.beans;

import by.kutovoy.satellite.positions.Position;
import by.kutovoy.satellite.positions.Size;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

/**
 *
 * @author dmitry
 */
public abstract class Entity {

    private static int amount = 0;
    private int id;
    private Position position;
    private Size size;
    private Texture texture;

    public Entity() {
        setId();
        position = new Position(0, 0);
        size = new Size(0, 0);
    }

    public Entity(Position position, Texture texture, Size size) {
        setId();
        this.position = position;
        this.texture = texture;
        this.size = size;
    }

    public Entity(Position position, String texture, Size size) {
        setId();
        this.position = position;
        this.texture = new Texture(texture);
        this.size = size;
    }

    public abstract void draw(Batch batch);
    
    @Override
    public abstract String toString();

    public void dispose() {
        texture.dispose();
    }

    /**
     * @return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * @return the texture
     */
    public Texture getTexture() {
        return texture;
    }

    /**
     * @param texture the texture to set
     */
    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    /**
     * @return the size
     */
    public Size getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Size size) {
        this.size = size;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private void setId() {
        amount++;
        this.id = amount;
    }
}
