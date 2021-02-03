package MethodAndConstructorReferenceOperatorDemos;

public class ConstructorReferenceUsingDoubleColonOperator {

	public static void main(String[] args) {


		Interf1 i = Sample::new;

		// the above statement refers to Sample() constrcutor using ::
		// operator

		// thus get() internally refers to Sample class no arg constructor
		i.get();

	}

}
