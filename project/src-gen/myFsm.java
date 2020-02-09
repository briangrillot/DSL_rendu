class myFsm extends FSM{
			public static void main(String args[]){
							State initial = new sI();
							State finalState = new sF();
							State current =  initial;
							System.out.println("Début");
							while (current != finalState){
								switch (current.getClass().getName()) {
									case "sI":
										System.out.println("Transition de l'état initial à l'état ouvert");
										current = new sOpen();
										break;
									case "sOpen":
										System.out.println("Transition de l'état ouvert à l'état fermé");
										current = new sFerme();
										break;
									case "sFerme":
										System.out.println("Transition de l'état fermé à l'état final");
										current = finalState;
										break;
								}
							}
							System.out.println("Etat final atteind");
						}