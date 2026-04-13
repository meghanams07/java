class HospitalRunner{
	public static void main(String[] args){
		
		Hospital hospital = new Hospital();

		Doctor d1 = new Doctor();
		d1.setDoctorId(1); d1.setDoctorName("Doctor1"); d1.setSpecialization("Cardiology");
		hospital.addDoctor(d1);

		Doctor d2 = new Doctor();
		d2.setDoctorId(2); d2.setDoctorName("Doctor2"); d2.setSpecialization("Neurology");
		hospital.addDoctor(d2);

		Doctor d3 = new Doctor();
		d3.setDoctorId(3); d3.setDoctorName("Doctor3"); d3.setSpecialization("Dermatology");
		hospital.addDoctor(d3);

		Doctor d4 = new Doctor();
		d4.setDoctorId(4); d4.setDoctorName("Doctor4"); d4.setSpecialization("Pediatrics");
		hospital.addDoctor(d4);

		Doctor d5 = new Doctor();
		d5.setDoctorId(5); d5.setDoctorName("Doctor5"); d5.setSpecialization("Orthopedics");
		hospital.addDoctor(d5);

		Doctor d6 = new Doctor();
		d6.setDoctorId(6); d6.setDoctorName("Doctor6"); d6.setSpecialization("Cardiology");
		hospital.addDoctor(d6);

		Doctor d7 = new Doctor();
		d7.setDoctorId(7); d7.setDoctorName("Doctor7"); d7.setSpecialization("Neurology");
		hospital.addDoctor(d7);

		Doctor d8 = new Doctor();
		d8.setDoctorId(8); d8.setDoctorName("Doctor8"); d8.setSpecialization("Dermatology");
		hospital.addDoctor(d8);

		Doctor d9 = new Doctor();
		d9.setDoctorId(9); d9.setDoctorName("Doctor9"); d9.setSpecialization("Pediatrics");
		hospital.addDoctor(d9);

		Doctor d10 = new Doctor();
		d10.setDoctorId(10); d10.setDoctorName("Doctor10"); d10.setSpecialization("Orthopedics");
		hospital.addDoctor(d10);

		Doctor d11 = new Doctor();
		d11.setDoctorId(11); d11.setDoctorName("Doctor11"); d11.setSpecialization("Cardiology");
		hospital.addDoctor(d11);

		Doctor d12 = new Doctor();
		d12.setDoctorId(12); d12.setDoctorName("Doctor12"); d12.setSpecialization("Neurology");
		hospital.addDoctor(d12);

		Doctor d13 = new Doctor();
		d13.setDoctorId(13); d13.setDoctorName("Doctor13"); d13.setSpecialization("Dermatology");
		hospital.addDoctor(d13);

		Doctor d14 = new Doctor();
		d14.setDoctorId(14); d14.setDoctorName("Doctor14"); d14.setSpecialization("Pediatrics");
		hospital.addDoctor(d14);

		Doctor d15 = new Doctor();
		d15.setDoctorId(15); d15.setDoctorName("Doctor15"); d15.setSpecialization("Orthopedics");
		hospital.addDoctor(d15);

		Doctor d16 = new Doctor();
		d16.setDoctorId(16); d16.setDoctorName("Doctor16"); d16.setSpecialization("Cardiology");
		hospital.addDoctor(d16);

		Doctor d17 = new Doctor();
		d17.setDoctorId(17); d17.setDoctorName("Doctor17"); d17.setSpecialization("Neurology");
		hospital.addDoctor(d17);

		Doctor d18 = new Doctor();
		d18.setDoctorId(18); d18.setDoctorName("Doctor18"); d18.setSpecialization("Dermatology");
		hospital.addDoctor(d18);

		Doctor d19 = new Doctor();
		d19.setDoctorId(19); d19.setDoctorName("Doctor19"); d19.setSpecialization("Pediatrics");
		hospital.addDoctor(d19);

		hospital.getDetails();
	}
}