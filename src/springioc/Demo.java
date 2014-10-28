/**
 * 
 */
package springioc;

/**
 * @author sayed
 *
 */
public class Demo {
	private String name;
	private ReferenceClass referenceClass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReferenceClass getReferenceClass() {
		return referenceClass;
	}

	public void setReferenceClass(ReferenceClass referenceClass) {
		this.referenceClass = referenceClass;
	}

	@Override
	public String toString() {
		return "Demo [name=" + name + ", referenceClass=" + referenceClass
				+ "]";
	}

}
