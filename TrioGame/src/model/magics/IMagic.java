package model.magics;

import model.champions.Champion;
import model.magics.Magic.MagicTypes;

public interface IMagic {

	MagicTypes getType();

	void affect(Champion target);

}
