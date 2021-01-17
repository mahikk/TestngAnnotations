package org.ornageHRM.dropdown;

public enum DropDown {

//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
//To create an enum, use the enum keyword (instead of class or interface), 
	//and separate the constants with a comma. Note that they should be in uppercase letters:
	//Enum is short for "enumerations", which means "specifically listed"
	
	
	INDEX{
		@Override
		public String toString() {
			return "index";
		}
		
	},
	
	VALUE{
		@Override
		public String toString() {
			return "value";
		}
	},
	
	VISIBLETEXT{
		@Override
		public String toString() {
			return "visibletext";
		}
	}
}
