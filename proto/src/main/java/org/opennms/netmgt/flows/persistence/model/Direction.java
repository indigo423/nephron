// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: flowdocument.proto

package org.opennms.netmgt.flows.persistence.model;

/**
 * Protobuf enum {@code Direction}
 */
public enum Direction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INGRESS = 0;</code>
   */
  INGRESS(0),
  /**
   * <code>EGRESS = 1;</code>
   */
  EGRESS(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INGRESS = 0;</code>
   */
  public static final int INGRESS_VALUE = 0;
  /**
   * <code>EGRESS = 1;</code>
   */
  public static final int EGRESS_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Direction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Direction forNumber(int value) {
    switch (value) {
      case 0: return INGRESS;
      case 1: return EGRESS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Direction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Direction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Direction>() {
          public Direction findValueByNumber(int number) {
            return Direction.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.opennms.netmgt.flows.persistence.model.EnrichedFlowProtos.getDescriptor().getEnumTypes().get(0);
  }

  private static final Direction[] VALUES = values();

  public static Direction valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Direction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Direction)
}

