import net.datastructures.*;
import java.lang.String;
import java.util.Pair;

public class Type2C {
    /** Cost of the Warehouse **/
    private int cost;
    /** Name of the warehouse, ie Paleto Forest Bunker **/
    private String name;
    /** Coordinates of the warehouse **/
    private Pair coordinates;
    /** The money output of the warehouse **/
    private int money;
    /** The time for the whole output **/
    private int time;
    /** Stock percent full **/
    private int stockPercent;
    /** Supplies percent full **/
    private int supplyPercent;
    /** Sell percent **/
    private int sellPercent;

    /** Set of constants **/
    protected int supply = 100;
    protected int perPackage = 40;
    protected int stock = 10;
    /** Based on the output($)/time(min) and upgrades **/
    protected int[][] output = {{200000, 240000, 280000}, {500, 400, 300}};

    /**
     * This is a constructor for the bunker class.
     * @param c Cost of the bunker
     * @param bname Name of the bunker
     * @param coords Coordinates of the bunker
     * @param upgrades Array of the upgrades the user owns
     * @param stock Current produced stock
     * @param supp Current gathered supplies
     * @param sell The sell percentage
     */
    public Type2C(int c, String bname, Pair coords, int[2] upgrades, int stock, int supp, int sell) {
        cost = c;
        name = bname;
        coordinates = coords;
        money = output[0][upgrades[0]];
        time = output[1][upgrades[1]];
        stockPercent = stock;
        supplyPercent = supp;
        sellPercent = sell;
    }

    /**
     * This is a constructor for the bunker class.
     * @param c Cost of the bunker
     * @param bname Name of the bunker
     * @param coords Coordinates of the bunker
     */
    public Type2C(int c, String bname, Pair coords) {
        cost = c;
        name = bname;
        coordinates = coords;
        money = output[0][0];
        time = output[1][0];
        stockPercent = 0;
        supplyPercent = 0;
        sellPercent = 0;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public Pair getCoordinates() {
        return coordinates;
    }

    public int getMoney() {
        return money;
    }

    public int getTime() {
        return time;
    }

    public int getStockPercent() {
        return stockPercent;
    }

    public int getSupplyPercent() {
        return supplyPercent;
    }

    public int getSellPercent() {
        return sellPercent;
    }

    public int getStock() {
        return (stock * stockPercent);
    }

    public int getSupply() {
        return (supply * supplyPercent);
    }

    public int getCurrentMoney() {
        return (money * sellPercent);
    }

    public void setCoordinates(Pair coordinates) {
        this.coordinates = coordinates;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setStockPercent(int stockPercent) {
        this.stockPercent = stockPercent;
    }

    public void setSupplyPercent(int supplyPercent) {
        this.supplyPercent = supplyPercent;
    }

    public void setSellPercent(int sellPercent) {
        this.sellPercent = sellPercent;
    }
}