class RequiredArgsConstructor1 {
	final int x;
	String name;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public RequiredArgsConstructor1(final int x) {
		this.x = x;
	}
}
class RequiredArgsConstructorAccess {
	final int x;
	String name;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	protected RequiredArgsConstructorAccess(final int x) {
		this.x = x;
	}
}
class RequiredArgsConstructorStaticName {
	final int x;
	String name;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	private RequiredArgsConstructorStaticName(final int x) {
		this.x = x;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static RequiredArgsConstructorStaticName staticname(final int x) {
		return new RequiredArgsConstructorStaticName(x);
	}
}
class RequiredArgsConstructorWithAnnotations {
	final int x;
	String name;
	@Deprecated
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public RequiredArgsConstructorWithAnnotations(final int x) {
		this.x = x;
	}
}
class AllArgsConstructor1 {
	final int x;
	String name;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public AllArgsConstructor1(final int x, final String name) {
		this.x = x;
		this.name = name;
	}
}
class NoArgsConstructor1 {
	int x;
	String name;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public NoArgsConstructor1() {
	}
}
class RequiredArgsConstructorStaticNameGenerics<T extends Number> {
	final T x;
	String name;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	private RequiredArgsConstructorStaticNameGenerics(final T x) {
		this.x = x;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static <T extends Number> RequiredArgsConstructorStaticNameGenerics<T> of(final T x) {
		return new RequiredArgsConstructorStaticNameGenerics<T>(x);
	}
}
class RequiredArgsConstructorStaticNameGenerics2<T extends Number> {
	final Class<T> x;
	String name;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	private RequiredArgsConstructorStaticNameGenerics2(final Class<T> x) {
		this.x = x;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static <T extends Number> RequiredArgsConstructorStaticNameGenerics2<T> of(final Class<T> x) {
		return new RequiredArgsConstructorStaticNameGenerics2<T>(x);
	}
}
class AllArgsConstructorPackageAccess {
	final String x;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	AllArgsConstructorPackageAccess(final String x) {
		this.x = x;
	}
}
class NoArgsConstructor2 {
	final int x;
	final double y;
	final char c;
	final boolean b;
	final float f;
	final String s;
	byte z;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public NoArgsConstructor2() {
		this.x = 0;
		this.y = 0.0;
		this.c = '\000';
		this.b = false;
		this.f = 0.0F;
		this.s = null;
	}
}
