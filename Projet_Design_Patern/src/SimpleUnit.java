class SimpleUnit extends Unit {
    private Tool tool;
    private boolean mounted;

    public SimpleUnit(UnitType type, int foodCost) {
        super(type, foodCost);
        this.tool = new Tool(1);
        this.mounted = false;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean mounted) {
        this.mounted = mounted;
    }
}