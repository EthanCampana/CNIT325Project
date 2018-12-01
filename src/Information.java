/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ethan
 */
public abstract class Information {
    
    protected String Name;
    protected String Description;
    protected Address Address;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }
        
}
