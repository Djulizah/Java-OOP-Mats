public class fruit {
    int stock;
    
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void stockStatus(){
        //print stock status
        if (stock < 100) {
            System.out.println("Fill up the fruits!");
        } else {
            System.out.println("It's selling time baby!");
        }
    }

    public static void main(String[] args) {
        fruit apple = new fruit();
        apple.setStock(50);

        fruit orange = new fruit();
        orange.setStock(75);

        fruit wMelon = new fruit();
        wMelon.setStock(150);

        // Call stockStatus directly on each object
        apple.stockStatus(); 
        orange.stockStatus();
        wMelon.stockStatus();
    }
}
