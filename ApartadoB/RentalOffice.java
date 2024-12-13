import java.util.*;

public class RentalOffice {
    private String address;
    private Integer feeForDelivery;

    private List<Car> cars;
    private List<Rental> rentals;
    private List<WebRental> webRentals;

    public RentalOffice(String address, Integer feeForDelivery) {
        this.address = address;
        this.feeForDelivery = feeForDelivery;
        this.rentals = new LinkedList<Rental>();
        this.cars = new LinkedList<Car>();
        this.webRentals = new LinkedList<WebRental>();
        System.out.println("La oficina situada en " + address + " se ha creado correctamente");
    }

    private String getAddress() {
        return address;
    }

    private Integer getFeeForDelivery(){
        return feeForDelivery;
    }

    protected List<Rental> getRental(){
        return rentals;
    }

    protected List<Car> getCars(){
        return cars;
    }

    protected List<WebRental> getWebRentals(){
        return webRentals;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setfeeForDelivery(Integer feeForDelivery) {
        this.feeForDelivery = feeForDelivery;
    }

    private void setRentals(List<Rental> rentals){
        this.rentals = rentals;
    }

    private void setCars(List<Car> cars){
        this.cars = cars;
    }

    private void setWebRentals(List<WebRental> webRentals){
        this.webRentals = webRentals;
    }

}
