package pojo.petstore.pet;

public class OrderForPet {
    
    public int id;
    public int petId;
    public int quantity;
    public int  shipDate;
    public String status;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getPetId() {
        return petId;
    }
    
    public void setPetId(int petId) {
        this.petId = petId;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getShipDate() {
        return shipDate;
    }
    
    public void  setShipDate(int shipDate) {
        this.shipDate = shipDate;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public boolean isComplete() {
        return complete;
    }
    
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
    public boolean complete;
}
