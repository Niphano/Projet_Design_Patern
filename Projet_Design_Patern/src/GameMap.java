class GameMap {
    private int width;
    private int height;
    private Resource[][] resources;

    public GameMap(int width, int height) {
        this.width = width;
        this.height = height;
        this.resources = new Resource[width][height];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Resource getResource(int x, int y) {
        return resources[x][y];
    }

    public void setResource(int x, int y, Resource resource) {
        resources[x][y] = resource;
    }
}