package ProjetoZoo;

public class Carnivoros extends Animal {
		
		@Override
		public void som() {
			System.out.println("Emitindo som...");
		}
		
		public void alimentar() {
			System.out.println("Comendo outro animal...");
		}

}
