object Q3 extends App {

	def unit_cost(x:Double):Double= (x - x*40/100)
	
	def shipping_cost(y:Int)=3 + (y-50)*0.75
	
	def total_cost(s:Double,r:Int):Double= unit_cost(s)*r + shipping_cost(r)
	
	println("Unit Cost = " + unit_cost(24.95))
	println("Shipping Cost = " + shipping_cost(60))
	println("Total Cost = " + total_cost(24.95,60))


    
}
