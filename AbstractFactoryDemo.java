/**
 * Abstract factory is a pattern that works around a super-factory
 * which creates other factories. This factory is also called
 * factory of factories.
 */
package abstract_factory;

/**
 * @author Rick
 *
 */
public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		Color red = colorFactory.getColor("red");
		
		red.fill();
		circle.draw();

	}

}
