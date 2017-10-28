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
    private String name;

    public Entity() {
        setId();
        position = new Position(0, 0);
        size = new Size(0, 0);
        name = "" + id;
    }

    public Entity(Position position, Texture texture, Size size, String name) {
        setId();
        this.position = position;
        this.texture = texture;
        this.size = size;
        this.name = name;
    }

    public Entity(Texture texture, Size size, String name) {
        setId();
        this.position = new Position(0, 0);
        this.texture = texture;
        this.size = size;
        this.name = name;
    }

    public abstract void draw(Batch batch);

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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
