package vici.entities.Cytoscape;

import java.util.HashMap;

public class DataNode {

    private String id;

    private String label;
    private String type;
    private int quantity;

    private String value;

    private HashMap<String, Long> quantities;

    public DataNode(String id, String label, String type, String value) {
        this.id = id;
        this.label = label;
        this.type = type;
        this.quantity = 0;
        this.value = value;
        this.quantities = new HashMap<>();
    }

    public void increaseQuantity(String key) {
        if (!quantities.containsKey(key)) {
            quantities.put(key, (long) 0);
        }
        quantities.put(key, quantities.get(key) + 1);
        quantity++;
    }

    public void increaseQuantity() {
        quantity++;
    }

    public HashMap<String, Long> getQuantities() {
        return quantities;
    }

    public void setQuantities(HashMap<String, Long> quantities) {
        this.quantities = quantities;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
