package home.joci.wildcard;

import java.util.function.Supplier;

import home.joci.model.Mosaic;
import home.joci.model.Tile;

public interface WildCard {
	
	Mosaic create (Supplier<? extends Tile> tileFactory);

}
