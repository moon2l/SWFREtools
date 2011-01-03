package tv.porst.swfretools.parser.structures;

import tv.porst.splib.io.BinaryParser;

public class CurvedEdgeRecordParser {

	public static CurvedEdgeRecord parse(final BinaryParser parser) {
		final boolean typeFlag = parser.readFlag();
		final boolean straightFlag = parser.readFlag();
		final int numBits = parser.readBits(4);
		final int controlDeltaX = parser.readSBits(numBits + 2);
		final int controlDeltaY = parser.readSBits(numBits + 2);
		final int anchorDeltaX = parser.readSBits(numBits + 2);
		final int anchorDeltaY = parser.readSBits(numBits + 2);

		return new CurvedEdgeRecord(typeFlag, straightFlag, numBits, controlDeltaX, controlDeltaY, anchorDeltaX, anchorDeltaY);
	}

}