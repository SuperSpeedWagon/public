package ch.sweng.inventory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
    private Inventory inventory;

    @Given("there are {int} sweaters in the inventory")
    public void withXSweatersInInventory(int nSweaters){
        this.inventory = new Inventory();
        for (int i = 0; i < nSweaters; i++) {
            this.inventory.add(Product.SWEATER);
        }
    }

    @When("one sweater is received")
    public void receiveSweater(){
        this.inventory.add(Product.SWEATER);
    }

    @Then("there are 5 sweaters in the inventory")
    public void receivedExtraSweater(){
        inventory.getProductQuantity(Product.SWEATER);
    }

}
