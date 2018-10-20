/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author kvs25
 */
public class SupplierDirectory {

    private ArrayList<Supplier> supplierDirectory;

    public SupplierDirectory() {
        supplierDirectory = new ArrayList<>();
    }

    public Supplier addSupplier() {
        Supplier s = new Supplier();
        supplierDirectory.add(s);
        return s;
    }

    public void removeSupplier(Supplier s) {
        supplierDirectory.remove(s);
    }

    public Supplier searchSupplier(String searchText) {
        for (Supplier supplier : supplierDirectory) {
            if (searchText.equalsIgnoreCase(supplier.getSupplierName())) {
                return supplier;
            }

        }
        return null;
    }
}
