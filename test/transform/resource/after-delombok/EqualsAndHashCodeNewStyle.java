public class EqualsAndHashCodeNewStyle {
	int b;
	double c;
	int f;
	int d;
	int f() {
		return 0;
	}
	int g;
	long i() {
		return 0;
	}
	int j;
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof EqualsAndHashCodeNewStyle)) return false;
		final EqualsAndHashCodeNewStyle other = (EqualsAndHashCodeNewStyle) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (this.b != other.b) return false;
		if (java.lang.Double.compare(this.c, other.c) != 0) return false;
		if (this.d != other.d) return false;
		if (this.f() != other.f()) return false;
		if (this.i() != other.i()) return false;
		return true;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof EqualsAndHashCodeNewStyle;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.b;
		final long $c = java.lang.Double.doubleToLongBits(this.c);
		result = result * PRIME + (int) ($c >>> 32 ^ $c);
		result = result * PRIME + this.d;
		result = result * PRIME + this.f();
		final long $$i = this.i();
		result = result * PRIME + (int) ($$i >>> 32 ^ $$i);
		return result;
	}
}
