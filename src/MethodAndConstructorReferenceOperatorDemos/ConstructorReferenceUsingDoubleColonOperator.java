package MethodAndConstructorReferenceOperatorDemos;

public class ConstructorReferenceUsingDoubleColonOperator {

	public static void main(String[] args) {
		// here we want to invoke get() method from interface interf1 which
		// returns Sample object

		// the Sample() constructor referenced consisted print statement which
		// is then displayed using get() method

		Interf1 i = Sample::new;

		// in short the above statement refers to Sample() constrcutor using ::
		// operator

		// thus get() internally refers to Sample class no arg constructor

		// to get the sample object we used get() method
		Sample s = i.get();

	}

}
