/**
 * 
 */
package library.dk_grid;

import java.util.Map;
import java.util.Optional;

import library.grid.Cell;



/**
 * @author Steve Brown
 *
 * The strategy for mapping & retrieving a row from a grid.
 * 
 */
public interface KeyStrategyRow {
	Optional<String> getKey(Map<String, Cell> columns);
	String getStrategyName();
	public <T extends KeyStrategyRow> Row<T> getNewRow();
}
