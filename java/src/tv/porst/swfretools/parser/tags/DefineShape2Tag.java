package tv.porst.swfretools.parser.tags;

import tv.porst.swfretools.parser.structures.RecordHeader;
import tv.porst.swfretools.parser.structures.Rect;
import tv.porst.swfretools.parser.structures.ShapeWithStyle;

public class DefineShape2Tag extends Tag {

	public DefineShape2Tag(final RecordHeader header, final int shapeId, final Rect shapeBounds,
			final ShapeWithStyle shapes) {
		super(header);
	}

}