class WithMethodMarkedDeprecated {
	@Deprecated
	int annotation;
	/**
	 * @deprecated
	 */
	int javadoc;
	WithMethodMarkedDeprecated(int annotation, int javadoc) {
	}
	/**
	 * @return a clone of this object, except with this updated property (returns {@code this} if an identical value is passed).
	 */
	@java.lang.Deprecated
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public WithMethodMarkedDeprecated withAnnotation(final int annotation) {
		return this.annotation == annotation ? this : new WithMethodMarkedDeprecated(annotation, this.javadoc);
	}
	/**
	 * @deprecated
	 * @return a clone of this object, except with this updated property (returns {@code this} if an identical value is passed).
	 */
	@java.lang.Deprecated
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public WithMethodMarkedDeprecated withJavadoc(final int javadoc) {
		return this.javadoc == javadoc ? this : new WithMethodMarkedDeprecated(this.annotation, javadoc);
	}
}
