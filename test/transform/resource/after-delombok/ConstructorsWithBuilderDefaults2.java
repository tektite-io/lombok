//CONF: lombok.noArgsConstructor.extraPrivate = true
import lombok.NoArgsConstructor;
final class ConstructorsWithBuilderDefaults<T> {
	private final java.util.List<T> z;
	private final T x;
	private final T q;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	private static <T> java.util.List<T> $default$z() {
		return new java.util.ArrayList<T>();
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	private static <T> T $default$x() {
		return null;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	ConstructorsWithBuilderDefaults(final java.util.List<T> z, final T x, final T q) {
		this.z = z;
		this.x = x;
		this.q = q;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static class ConstructorsWithBuilderDefaultsBuilder<T> {
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private boolean z$set;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private java.util.List<T> z$value;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private boolean x$set;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private T x$value;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private T q;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		ConstructorsWithBuilderDefaultsBuilder() {
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public ConstructorsWithBuilderDefaults.ConstructorsWithBuilderDefaultsBuilder<T> z(final java.util.List<T> z) {
			this.z$value = z;
			z$set = true;
			return this;
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public ConstructorsWithBuilderDefaults.ConstructorsWithBuilderDefaultsBuilder<T> x(final T x) {
			this.x$value = x;
			x$set = true;
			return this;
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public ConstructorsWithBuilderDefaults.ConstructorsWithBuilderDefaultsBuilder<T> q(final T q) {
			this.q = q;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public ConstructorsWithBuilderDefaults<T> build() {
			java.util.List<T> z$value = this.z$value;
			if (!this.z$set) z$value = ConstructorsWithBuilderDefaults.<T>$default$z();
			T x$value = this.x$value;
			if (!this.x$set) x$value = ConstructorsWithBuilderDefaults.<T>$default$x();
			return new ConstructorsWithBuilderDefaults<T>(z$value, x$value, this.q);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public java.lang.String toString() {
			return "ConstructorsWithBuilderDefaults.ConstructorsWithBuilderDefaultsBuilder(z$value=" + this.z$value + ", x$value=" + this.x$value + ", q=" + this.q + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public static <T> ConstructorsWithBuilderDefaults.ConstructorsWithBuilderDefaultsBuilder<T> builder() {
		return new ConstructorsWithBuilderDefaults.ConstructorsWithBuilderDefaultsBuilder<T>();
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	private ConstructorsWithBuilderDefaults() {
		this.q = null;
		this.z = ConstructorsWithBuilderDefaults.$default$z();
		this.x = ConstructorsWithBuilderDefaults.$default$x();
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public java.util.List<T> getZ() {
		return this.z;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public T getX() {
		return this.x;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public T getQ() {
		return this.q;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof ConstructorsWithBuilderDefaults)) return false;
		final ConstructorsWithBuilderDefaults<?> other = (ConstructorsWithBuilderDefaults<?>) o;
		final java.lang.Object this$z = this.getZ();
		final java.lang.Object other$z = other.getZ();
		if (this$z == null ? other$z != null : !this$z.equals(other$z)) return false;
		final java.lang.Object this$x = this.getX();
		final java.lang.Object other$x = other.getX();
		if (this$x == null ? other$x != null : !this$x.equals(other$x)) return false;
		final java.lang.Object this$q = this.getQ();
		final java.lang.Object other$q = other.getQ();
		if (this$q == null ? other$q != null : !this$q.equals(other$q)) return false;
		return true;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $z = this.getZ();
		result = result * PRIME + ($z == null ? 43 : $z.hashCode());
		final java.lang.Object $x = this.getX();
		result = result * PRIME + ($x == null ? 43 : $x.hashCode());
		final java.lang.Object $q = this.getQ();
		result = result * PRIME + ($q == null ? 43 : $q.hashCode());
		return result;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public java.lang.String toString() {
		return "ConstructorsWithBuilderDefaults(z=" + this.getZ() + ", x=" + this.getX() + ", q=" + this.getQ() + ")";
	}
}
