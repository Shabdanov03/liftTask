public class Elevator {
    private int currentFloor;
    private int capacity;
    private int maxFloor;

    public Elevator(int currentFloor, int capacity, int maxFloor) {
        this.currentFloor = currentFloor;
        this.capacity = capacity;
        this.maxFloor = maxFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }


    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void moveToFloor(int floornumber, int weigth) {
        if (isAllowableFloor(floornumber) && isAllowableWeight(weigth)) {
            while (currentFloor != floornumber) {
                if (currentFloor < floornumber) {
                    currentFloor++;
                    System.out.println(currentFloor);
                } else {
                    currentFloor--;
                    System.out.println(currentFloor);
                }
            }
        } else {
            if (!isAllowableFloor(floornumber))
                System.out.println("Sorry, Floor number must be greater than 0 and less than " + maxFloor);
            if (!isAllowableWeight(weigth))
                System.out.println("Sorry , Elevator can carry between 0 and " + capacity + " kilograms.");
        }
    }


    public boolean isAllowableWeight(int weigth) {
        if (weigth > 200 || weigth < 0) return false;
        else return true;
    }

    public boolean isAllowableFloor(int floornumber) {
        if (floornumber > maxFloor || floornumber < currentFloor) return false;
        else return true;
    }
}
