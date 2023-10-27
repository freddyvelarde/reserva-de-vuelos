public class Model<T> {
  private T entity;

  public Model(T newEntity) { this.entity = newEntity; }

  public T getEntity() { return entity; }
}
