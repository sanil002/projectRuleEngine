package project.myproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("discount")
   private int discount;
   @org.kie.api.definition.type.Label("type")
   private java.lang.String type;

   @org.kie.api.definition.type.Label(value = "years")
   private int years;

   public Customer()
   {
   }

   public int getDiscount()
   {
      return this.discount;
   }

   public void setDiscount(int discount)
   {
      this.discount = discount;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public int getYears()
   {
      return this.years;
   }

   public void setYears(int years)
   {
      this.years = years;
   }

   public Customer(int discount, java.lang.String type, int years)
   {
      this.discount = discount;
      this.type = type;
      this.years = years;
   }

}