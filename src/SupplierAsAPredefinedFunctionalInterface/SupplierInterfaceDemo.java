package SupplierAsAPredefinedFunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {

	public static void main(String[] args) {
		// Writing asupplier to get the systems date

		// this below lamda expression is definition for get() abstract method
		// of Supplier
		Supplier<Date> s = () -> new Date();

		System.out.println("Systems date is" + s.get());

		// writing a supplier to genarte random OTP
		Supplier<String> supplierForOtpGeneratuion = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				// Concatinating random rumber from 0 to 1 six times to generate
				// six digit OTP
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};

		System.out.println("OTP is" + supplierForOtpGeneratuion.get());
	}

}
