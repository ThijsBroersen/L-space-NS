package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReplyAction extends OntologyDef(
        iri = "http://schema.org/ReplyAction",
        iris = Set("http://schema.org/ReplyAction"),
        label = "ReplyAction",
        comment = """The act of responding to a question/message asked/sent by the object. Related to <a class="localLink" href="http://schema.org/AskAction">AskAction</a><br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/AskAction">AskAction</a>: Appears generally as an origin of a ReplyAction.</li>
</ul>
""",
        `@extends` = () => List(CommunicateAction.ontology)
       ){
}