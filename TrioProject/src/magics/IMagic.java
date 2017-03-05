package magics;

import champions.Champion;
import magics.Magic.MagicTypes;

public interface IMagic {

	MagicTypes getType();

	void affect(Champion target);

}
