/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttooem;

import java.util.Date;

/**
 *
 * @author Ralph Landon
 */
public class ScanData {
    String company = "";
    String well = "";
    String companyMan = "";
    String grade = "";
    String scanner = "";
    Date date;
    String size;
    String pullingUnit;
    double scanPrice;
    double mileage;
    double totalPrice;
    double standby;
    int numberOfJoints;

    @Override
    public String toString() {
        return "ScanData{" + "company=" + company + ", well=" + well + ", companyMan=" + companyMan + ", grade=" + grade + ", scanner=" + scanner + ", date=" + date + ", size=" + size + ", pullingUnit=" + pullingUnit + ", scanPrice=" + scanPrice + ", mileage=" + mileage + ", totalPrice=" + totalPrice + ", standby=" + standby + '}';
    }
    
}
