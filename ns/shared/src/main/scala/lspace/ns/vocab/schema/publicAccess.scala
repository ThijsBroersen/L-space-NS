package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object publicAccess extends PropertyDef(
        iri = "http://schema.org/publicAccess",
        iris = Set("http://schema.org/publicAccess"),
        label = "publicAccess",
        comment = """A flag to signal that the <a class="localLink" href="http://schema.org/Place">Place</a> is open to public visitors.  If this property is omitted there is no assumed default boolean value""",
        `@extends` = () => List(),
        `@range` = () => List(`@boolean`)
       ){
}