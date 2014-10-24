//    Wanda POS  - Africa's Gift to the World
//    Copyright (c) 2014-2015 IT-Kamer & previous Unicenta POS and Openbravo POS works
//    www.erp-university-africa.com
//
//    This file is part of Wanda POS
//
//    Wanda POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   Wanda POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Wanda POS.  If not, see <http://www.gnu.org/licenses/>.


package com.openbravo.pos.printer;

/**
 *
 * @author adrianromero
 */
public class FlyerAnimator extends BaseAnimator {
    
    /**
     *
     * @param line1
     * @param line2
     */
    public FlyerAnimator(String line1, String line2) {
        baseLine1 = DeviceTicket.alignLeft(line1, 20);
        baseLine2 = DeviceTicket.alignLeft(line2, 20);
    }
    
    /**
     *
     * @param i
     */
    @Override
    public void setTiming(int i) {

        if (i < 20) {
            currentLine1 = DeviceTicket.alignRight(baseLine1.substring(0, i), 20);
            currentLine2 = DeviceTicket.alignRight(baseLine2.substring(0, i), 20);
        } else {
            currentLine1 = baseLine1;
            currentLine2 = baseLine2;
        }
    }
}
