package magics;

import champions.Champion;

public class IceBlock extends Magic implements IMageMagic, ISelfCastSpells {

	public IceBlock() {
		super(MagicTypes.ICEBLOCK);
		
	}

	@Override
	public void affect(Champion target) {
		target.invulnurability = true;
		target.isCrowControlled = true;
	}
}
