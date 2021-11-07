/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahmoud
 */
public  class Mammal implements animall{
    String numlegs;
    String favfood;

   public String NoOflges(){
       return numlegs;
   }
    
   public String FavFood(){
       return favfood;
       
   }

    public String getNumlegs() {
        return numlegs;
    }

    public String getFavfood() {
        return favfood;
    }
   

    @Override
    public void eat() {
          }

    @Override
    public void travel() {
    
    }
        
   
}
