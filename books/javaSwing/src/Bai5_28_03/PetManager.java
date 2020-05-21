/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5_28_03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class PetManager<T> {
    List<T> pets;

   public void setPets(List<T> pets)
   {
       this.pets=pets;
   }
   public List<T>getPets()
   {
       if(pets==null)
           pets=new ArrayList<T>();
       return this.pets;
   }
}
