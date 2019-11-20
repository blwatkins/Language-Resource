# Helper Functions

helpers do
    # define helper functions

    def render_view(path)
        erb(path.to_sym)
    end

    def h(text)
        Rack::Utils.escape_html(text)
    end

end
